package FairWork.Lect_Inter_ParkingLot.dtos;


public class GenerateTicketResponseDTO {
    // ideally you shouldn't embed a model inside response dto (should copy individual properties)
//    private Ticket ticket;
    private Long generatedTicketId;

    // these two can be moved to a base class which all response dtos can inherit
    private ResponseStatus status;
    private String message;

    public Long getGeneratedTicketId() {
        return generatedTicketId;
    }

    public void setGeneratedTicketId(Long generatedTicketId) {
        this.generatedTicketId = generatedTicketId;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
