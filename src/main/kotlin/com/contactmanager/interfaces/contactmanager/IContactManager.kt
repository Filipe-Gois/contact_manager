package com.contactmanager.interfaces.contactmanager

import com.contactmanager.data.dtos.contacts.ViewContactDTO

interface IContactManager {
    val contacts: MutableList<ViewContactDTO>
}