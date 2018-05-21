package SOLID.SRP.Violation

class Client {
    val ClientID: Long
    val Name: String
    val Email: String
    val CPF: String
    val DataCadastro: DateTime

    fun addClient(): String {
        if (!Email.compareTo("@"))
            return "Cliente com e-mail inválido"

        if (CPF.length != 11)
            return "Cliente com CPF inválido"
    }
}