package FairWork.Lect_Inter_Observor;

public class Demo {
    public static void main(String[] args) {
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();

        MainService.inst.createOrder();
    }
}
