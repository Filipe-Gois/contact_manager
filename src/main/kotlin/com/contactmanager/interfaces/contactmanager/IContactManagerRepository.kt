package com.contactmanager.interfaces.contactmanager

import com.contactmanager.data.dtos.contacts.CreateContactDTO
import com.contactmanager.data.dtos.contacts.ViewContactDTO

interface IContactManagerRepository {
    fun addNewContact(contact: CreateContactDTO)
    fun removeContact(contactId: String)
    fun updateContactData(updateContactDTO: ViewContactDTO)
    fun getContactByIdOrName(param: String): List<ViewContactDTO>
    fun viewAllContacts(): List<ViewContactDTO>
}