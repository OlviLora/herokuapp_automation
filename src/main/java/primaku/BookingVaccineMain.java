package primaku;

public class BookingVaccineMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean isSuccess = false;

        BookingVaccine bookingVaccine = new BookingVaccine();
        bookingVaccine.setDriver();
        bookingVaccine.initiateChrome();
        bookingVaccine.openHomePrimaku();
        bookingVaccine.clickButtonBookVaccine();
        bookingVaccine.removePopUpWindowIfExist();
        //bookingVaccine.checkSection("text_book_vaccine");
        bookingVaccine.closeBrowser();
    }
}
