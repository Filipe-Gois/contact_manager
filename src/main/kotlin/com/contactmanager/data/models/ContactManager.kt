package com.contactmanager.data.models

import com.contactmanager.data.dtos.contacts.ViewContactDTO
import com.contactmanager.interfaces.contactmanager.IContactManager

class ContactManager : IContactManager {
    override val contacts: MutableList<ViewContactDTO> = mutableListOf()


}