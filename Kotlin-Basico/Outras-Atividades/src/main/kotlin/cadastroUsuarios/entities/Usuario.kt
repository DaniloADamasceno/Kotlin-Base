package cadastroUsuarios.entities


class Usuario {

    public var id: Int = 0
    public var nomeCompleto: String = ""
    public var email: String = ""
    public var sexo: String = ""
    public var endereco: String = ""
    public var peso: Double = 0.0
    public var altura: Double = 0.0
    public var vacina: Int = 0

    //--------------------------------------------  Constructor  -------------------------------------------------------
    constructor(id: Int, nomeCompleto: String, email: String, sexo: String, endereco: String,
                peso: Double, altura: Double, vacina: Int) {

        this.id = id
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.sexo = sexo
        this.endereco = endereco
        this.peso = peso
        this.altura = altura
        this.vacina = vacina
    }


    //--------------------------------------------  Getters and Setters  -----------------------------------------------
    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getNomeCompleto(): String {
        return nomeCompleto
    }

    fun setNomeCompleto(nomeCompleto: String) {
        this.nomeCompleto = nomeCompleto
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getSexo(): String {
        return sexo
    }

    fun setSexo(sexo: String) {
        this.sexo = sexo
    }

    fun getEndereco(): String {
        return endereco
    }

    fun setEndereco(endereco: String) {
        this.endereco = endereco
    }

    fun getPeso(): Double {
        return peso
    }

    fun setPeso(peso: Double) {
        this.peso = peso
    }

    fun getAltura(): Double {
        return altura
    }

    fun setAltura(altura: Double) {
        this.altura = altura
    }

    fun getVacina(): Int {
        return vacina
    }

    fun setVacina(vacina: Int) {
        this.vacina = vacina
    }

    //--------------------------------------------  toString  ----------------------------------------------------------
    override fun toString(): String {
        return "Usuario(id=$id, nomeCompleto='$nomeCompleto', email='$email', sexo='$sexo'," +
                " endereco='$endereco', peso=$peso, altura=$altura, vacina=$vacina)"
    }

    //--------------------------------------------  equals  ------------------------------------------------------------
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Usuario) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }




}