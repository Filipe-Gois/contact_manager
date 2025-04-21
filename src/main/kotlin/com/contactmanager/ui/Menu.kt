package com.contactmanager.ui

import com.contactmanager.data.dtos.contacts.CreateContactDTO
import com.contactmanager.data.dtos.contacts.UpdateContactDTO
import com.contactmanager.repositories.contactmanager.ContactManagerRepository

class Menu {
    private val userName: String;
    private var option: String = "0"
    private val manager = ContactManagerRepository()

    init {

        println("Olá, informe o seu nome:")
        userName = readln()
        println("Seja muito bem-vindo, $userName :)")

        do {

            println(
                """O que deseja fazer ?
                [0] - Sair
                [1] - Cadastrar novo contato
                [2] - Visualizar lista de contatos
                [3] - Buscar contato
                [4] - Atualizar dados de um contato
                [5] - Excluir contato
            """.trimIndent()
            )
            option = readln()

            when (option) {
                "0" -> break
                "1" -> {

                    println("Informe o nome do contato")
                    var name = readln()
                    println("Informe o número do contato")
                    var phoneNumber = readln()

                    val newContact = CreateContactDTO(phoneNumber = phoneNumber, name = name)

                    manager.addNewContact(newContact)

                    println("Contato adicionado com sucesso!")

                }

                "2" -> {

                    val contatos = manager.viewAllContacts()

                    for (contato in contatos) {
                        println("Id: ${contato.contactId}, nome: ${contato.name}, número de telefone: ${contato.phoneNumber}")
                    }

                }

                "3" -> {
                    println("Informe o id, nome ou número de telefone do contato")
                    var param = readln()

                    val contatos = manager.getContactByIdOrName(param = param)

                    for (contato in contatos) {
                        println("Id: ${contato.contactId}, nome: ${contato.name}, número de telefone: ${contato.phoneNumber}")
                    }

                }

                "4" -> {
                    println("Informe o id do contato a ser atualizado")
                    var id = readln()

                    println("Informe o nome do contato")
                    var name = readln()

                    println("Informe o número do contato")
                    var phoneNumber = readln()

                    val contact = UpdateContactDTO(name = name, phoneNumber = phoneNumber)
                    manager.updateContactData(contactId = id, updateContactDTO = contact)

                    println("Contato atualizado com sucesso!")

                }

                "5" -> {
                    println("Informe o id do contato a ser excluído:")
                    val contactId = readln()

                    manager.removeContact(contactId = contactId)

                    println("Contato excluído com sucesso!")

                }

                else -> continue
            }

        } while (option != "0")

        println("Programa encerrado.")

    }

}