package com.contactmanager.repositories.contactmanager

import com.contactmanager.data.dtos.contacts.CreateContactDTO
import com.contactmanager.data.dtos.contacts.UpdateContactDTO
import com.contactmanager.data.dtos.contacts.ViewContactDTO
import com.contactmanager.data.models.ContactManager
import com.contactmanager.interfaces.contactmanager.IContactManagerRepository

class ContactManagerRepository : IContactManagerRepository {

    private val contactManager: ContactManager = ContactManager()

    override fun addNewContact(contact: CreateContactDTO) {

        val newUser = ViewContactDTO(
            name = contact.name,
            contactId = (contactManager.contacts.count() + 1).toString(),
            phoneNumber = contact.phoneNumber
        )

        contactManager.contacts.add(newUser)
    }

    override fun removeContact(contactId: String) {

        val searchedContact = contactManager.contacts.find { it.contactId == contactId }

        contactManager.contacts.remove(searchedContact)
    }

    override fun updateContactData(
        contactId: String, updateContactDTO: UpdateContactDTO
    ) {
        TODO("Not yet implemented")
    }

    override fun getContactByIdOrName(param: String): List<ViewContactDTO> = contactManager.contacts.filter {
        it.name.contains(param) || it.contactId.contains(param) || it.phoneNumber.contains(param)
    }

    override fun viewAllContacts(): List<ViewContactDTO> = contactManager.contacts

}