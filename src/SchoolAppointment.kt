data class SchoolAppointment(
    override var date: String,
    override var participant: String,
    override var description: String,
    override var type: String,
    override var location: String,
    override var startTime: String,
    override var endTime: String = "",
    override val id: String,
    var room: String,
) : Appointment
