package FairWork.Lect_Begin_ParkingLot.dtos;

public class GenerateTicketResponseDTO {
    private Long generatedTicketId;
    private String message;
    private ResponseStatus status;

    public Long getGeneratedTicketId() {
        return generatedTicketId;
    }

    public void setGeneratedTicketId(Long generatedTicketId) {
        this.generatedTicketId = generatedTicketId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
