package test.tests.CommunityScreen;

import org.testng.annotations.Test;
import test.config.General.ExcelFileConfig;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;


/**
 * Created by dell on 7/5/2017.
 */
public class Tests extends BrowserConfig {

    ExcelFileConfig excel = new ExcelFileConfig();
    public String ExcelFilePath = "src\\resources\\TestData";
    public String ExcelFileName = "TestData.xls";
    public String AppVersion = excel.getCellFromExcel(ExcelFilePath,ExcelFileName,"General",8,1).toString();
    public String FileName = "CommunityScreen";
    public String MenuText="Community";

    @Test
    public void TC_133() {

        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : All community list should display ");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        performAction.androidScrollToElement(100);
        //eventName = performAction.getEveryElementtestIntoList1(FileName, "ListOFMenu");
        methods.log("Verify Community list is display.");
        verify.verifyElementDisplay(FileName,"CommunityGroupImage1");
        verify.verifyElementDisplay(FileName,"CommunityGroupImage2");
      //  verify.verifyElementDisplay(FileName,"CommunityGroupImage3");
        performAction.pause(2);


    }
    @Test
    public void TC_134() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        performAction.pause(10);
        methods.log("Test Description : Each Community design should not overlap.");

        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        performAction.androidScrollToElement(100);
        //eventName = performAction.getEveryElementtestIntoList1(FileName, "ListOFMenu");
        methods.log("Verify Community list is not overlap.");
        verify.verifyElementDisplay(FileName,"CommunityGroupImage1");
        verify.verifyElementDisplay(FileName,"CommunityGroupImage2");
        //  verify.verifyElementDisplay(FileName,"CommunityGroupImage3");
        performAction.pause(2);
    }
    @Test
    public void TC_135() {
        String CommunityName ="Youth & Family";
        Steps step=new Steps(driver);
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : After clicking on community group, group detail screen should display.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.ScrollAndClick(CommunityName);
        performAction.pause(2);
        methods.log("Verify Community detail page is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPage");
        methods.log("Verify Community detail page heading is display.");
        performAction.getText(FileName,"CommunityDetailPage");

        performAction.pause(2);


    }

    //Group Detail Screen

    @Test
    public void TC_136() {
        String CommunityName ="Youth & Family";
        Steps step=new Steps(driver);
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        step.startActivity(AppVersion);
        methods.log("Test Description : Group image should display as configured by admin manager.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);

        performAction.pause(2);
        methods.log("Verify image is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPageImage");

        performAction.pause(2);

    }

    @Test
    public void TC_137() {
        String CommunityName ="Youth & Family";
        Steps step=new Steps(driver);
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Group description should display as configured by admin manager.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(2);
        methods.log("Verify Description is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPageDescription");
        performAction.getText(FileName,"CommunityDetailPageDescription");
        performAction.pause(2);
    }

    @Test
    public void TC_138() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventDate ="Jul 21";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step=new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Meeting date should display correct as configured by admin.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();

        performAction.pause(2);
        methods.log("Verify upcoming meeting date is display.");
        verify.verifyElementDisplayByIndex1(FileName,"MenuTextList",10);
        //performAction.getText(FileName,"UpcomingMeetingDate");
        performAction.pause(2);
    }

    @Test
    public void TC_139() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String Eventday ="Friday at 07:30 pm";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Meeting day should display correct.");

        performAction.pause(20);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(10);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(5);
        step.ScrollCommunity();
        performAction.pause(2);
        methods.log("Verify upcoming meeting day is display.");
        verify.verifyElementDisplayByIndex1(FileName,"MenuTextList",11);

        //verify.verifyElementDisplay(FileName,"UpcomingMeetingDay");
        //step.getSplitText(FileName,"UpcomingMeetingDay",0);
        performAction.pause(2);
    }
    @Test
    public void TC_140() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventTime ="Friday at 07:30 pm";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Meeting time should display correct.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(5);
        step.ScrollCommunity();
        performAction.pause(2);
        methods.log("Verify upcoming meeting Time is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",11);

        //verify.verifyElementDisplay(FileName,"UpcomingMeetingDay");
        //step.getSplitText(FileName,"UpcomingMeetingDay",2);
        performAction.pause(2);
    }

    @Test
    public void TC_141() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventGoingGembers ="0 going";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Number of going members should display correct.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);

        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(5);
        step.ScrollCommunity();
        performAction.pause(2);
        methods.log("Verify upcoming meeting going memers is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",12);

        //verify.verifyElementDisplay(FileName,"UpcomingMeetingGoingMemers");
        //performAction.getText(FileName,"UpcomingMeetingGoingMemers");
        performAction.pause(2);
    }

    @Test
    public void TC_142() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : Check group event should display correct.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(5);
        step.ScrollCommunity();
        performAction.pause(2);

        methods.log("Verify group event is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",9);

        //verify.verifyElementDisplay(FileName,"GroupEvent");
        performAction.pause(2);
    }

    //Group Event


    @Test
    public void TC_143() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        methods.log("Test Description : After clicking on group event name, then group event detail scren should display.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        methods.log("Verify group event detail page is display.");
        verify.verifyElementDisplayByIndex1(FileName,"MenuTextList",0);


        performAction.pause(2);
    }

    @Test
    public void TC_144() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String Eventday ="undefined, undefined undefined";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Event day should display as per calender date.");

        performAction.pause(5);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        methods.log("Verify event day is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",5);
        //verify.verifyElementDisplay(FileName,"GroupEventDate");
        //step.getSplitText1(FileName,"GroupEventDate",0);
        performAction.pause(2);
    }

    @Test
    public void TC_145() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventDate ="undefined, undefined undefined";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Event date should display correct and as per date day should display.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        methods.log("Verify event date is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",5);


        //verify.verifyElementDisplay(FileName,"GroupEventDate");
        //step.getSplitText1(FileName,"GroupEventDate",1);
        performAction.pause(2);
    }

    @Test
    public void TC_146() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventTime ="00:00 AM - 00:00 AM";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Event start and end time should display correct.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"ListOFMenu",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        methods.log("Verify event time is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",6);
        // verify.verifyElementDisplay(FileName,"GroupEventTime");
       // performAction.getText(FileName,"GroupEventTime");
        performAction.pause(2);
    }

    @Test
    public void TC_147() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Correct event photo should display.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        methods.log("Verify event image is display.");
        verify.verifyElementDisplay(FileName,"GroupEventImage");
        performAction.pause(2);
    }

    //@Test
    public void TC_148() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Once user will click on 'View More' link then same event photo should display.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(10);
        step.ScrollAndClick(CommunityName);
        performAction.pause(3);
        step.ScrollCommunityEvent(EventName);
        performAction.pause(5);
       // methods.log("Verify event image is display.");
       // verify.verifyElementDisplay(FileName,"GroupEventImage");
       // performAction.pause(2);
    }

    @Test
    public void TC_149() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String EventLocation ="15755 E Arapahoe Rd, Centennial, CO 80016";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Location address should display correct.");
        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify event location is display.");
        verify.verifyElementDisplayByIndex1(FileName,"EventDetailList",5);

        //verify.verifyElementDisplay(FileName,"GroupEventLocation");
        //performAction.getText(FileName,"GroupEventLocation");
        performAction.pause(2);
    }

    @Test
    public void TC_150() {
        String CommunityName ="Youth & Family";
        String EventLocation ="15755 E Arapahoe Rd, Centennial, CO 80016";

        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : Location pin should display as per defined address.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);

        performAction.pause(3);

        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        String EventName1 = performAction.getText(FileName, "GroupEventDetailPage");
        performAction.pause(3);
        performAction.androidScrollToElement(50);

        performAction.pause(2);
        String EventLocation1 = performAction.getText(FileName,"GroupEventLocation");
        performAction.pause(2);

        methods.log("Verify event location pin is display.");
        verify.verifyEventPinDisplay(EventName1, EventLocation1);
        performAction.pause(2);
    }

    @Test
    public void TC_151() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String RSVPButton ="RSVP";

        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : RSVP button should display event detail screen.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify RSVP button is display.");
        verify.verifyElementDisplayByText(FileName,"EventDetailList","RSVP");

        //verify.verifyElementDisplay(FileName, "RSVPButton");
        performAction.pause(2);
    }

    //Group Event RSVP

    @Test
    public void TC_152() {
        String CommunityName ="Youth & Family";
        String EventName ="Teens - Bowling Night";
        String RSVPPage ="RSVP Event";
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step = new Steps(driver);

        step.startActivity(AppVersion);
        Methods methods = new Methods(driver);
        methods.log("Test Description : RSVP detail screen should display after clicking on RSVP button.");

        performAction.pause(10);
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",6);
        performAction.pause(3);
        performAction.clickOnElementFromList(FileName,"MenuTextList",MenuText);
        performAction.pause(5);
        step.Scroll();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",1);
        performAction.pause(3);
        step.ScrollCommunity();
        performAction.clickOnElementFromListIndex(FileName,"MenuTextList",9);
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.clickOnElementFromList(FileName,"MenuTextList","RSVP");
        performAction.pause(2);

        methods.log("Verify Free Registration page is display.");
        verify.verifyElementDisplayByText(FileName,"EventDetailList","RSVP Event");

        //verify.verifyElementDisplay(FileName, "FreeRegistration");
        performAction.pause(2);
    }


}
