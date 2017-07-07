package test.tests.CommunityScreen;

import org.testng.annotations.Test;
import test.config.General.Methods;
import test.config.SeleniumConfig.BrowserConfig;
import test.tests.MyEventScreen.VerifyMyEvent;

import java.util.ArrayList;

/**
 * Created by dell on 7/5/2017.
 */
public class Tests extends BrowserConfig {
    public String FileName = "CommunityScreen";

    @Test
    public void TC_139() {

        //ArrayList<String> eventName;
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
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
    public void TC_140() {

        //ArrayList<String> eventName;
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
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
    public void TC_141() {

        //ArrayList<String> eventName;
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(5);
        performAction.click(FileName,"CommunityGroupDetail");
        //eventName = performAction.getEveryElementtestIntoList1(FileName, "ListOFMenu");
        performAction.pause(5);
        methods.log("Verify Community detail page is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPage");
        methods.log("Verify Community detail page heading is display.");
        verify.verifyText(FileName,"CommunityDetailPage","Automation Community Group");

        performAction.pause(2);


    }

    //Group Detail Screen

    @Test
    public void TC_142() {

        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(5);
        performAction.click(FileName,"CommunityGroupDetail");
        methods.log("Verify image is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPageImage");

        performAction.pause(2);


    }

    @Test
    public void TC_144() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(5);
        performAction.click(FileName,"CommunityGroupDetail");
        methods.log("Verify Description is display.");
        verify.verifyElementDisplay(FileName,"CommunityDetailPageDescription");
        performAction.getText(FileName,"CommunityDetailPageDescription");
        performAction.pause(2);
    }

    @Test
    public void TC_145() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify upcoming meeting date is display.");
        verify.verifyElementDisplay(FileName,"UpcomingMeetingDate");
        performAction.getText(FileName,"UpcomingMeetingDate");
        performAction.pause(2);
    }

    @Test
    public void TC_146() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify upcoming meeting day is display.");
        verify.verifyElementDisplay(FileName,"UpcomingMeetingDay");
        step.getSplitText(FileName,"UpcomingMeetingDay",0);
        performAction.pause(2);
    }
    @Test
    public void TC_147() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify upcoming meeting Time is display.");
        verify.verifyElementDisplay(FileName,"UpcomingMeetingDay");
        step.getSplitText(FileName,"UpcomingMeetingDay",2);
        performAction.pause(2);
    }

    @Test
    public void TC_148() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify upcoming meeting going memers is display.");
        verify.verifyElementDisplay(FileName,"UpcomingMeetingGoingMemers");
        performAction.getText(FileName,"UpcomingMeetingGoingMemers");
        performAction.pause(2);
    }

    @Test
    public void TC_150() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify group event is display.");
        verify.verifyElementDisplay(FileName,"GroupEvent");
        performAction.pause(2);
    }

    //Group Event


    @Test
    public void TC_151() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(15);
        //performAction.androidScrollToElement(50);
        //performAction.pause(2);
        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify group event detail page is display.");
        verify.verifyElementDisplay(FileName,"GroupEventDetailPage");
        //methods.log("Verify group event detail page heading is display.");
        //verify.verifyText(FileName,"GroupEventDetailPage","Healthy Event");
        performAction.pause(2);
    }

    @Test
    public void TC_152() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);
       // performAction.androidScrollToElement(50);
       // performAction.pause(2);
        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify event day is display.");
        verify.verifyElementDisplay(FileName,"GroupEventDate");
        step.getSplitText1(FileName,"GroupEventDate",0);
        performAction.pause(2);
    }

    @Test
    public void TC_153() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);
        //performAction.androidScrollToElement(50);
       // performAction.pause(2);
        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify event date is display.");
        verify.verifyElementDisplay(FileName,"GroupEventDate");
        step.getSplitText1(FileName,"GroupEventDate",1);
        performAction.pause(2);
    }

    @Test
    public void TC_154() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify event time is display.");
        verify.verifyElementDisplay(FileName,"GroupEventTime");
        performAction.getText(FileName,"GroupEventTime");
        performAction.pause(2);
    }

    @Test
    public void TC_155() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(15);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify event image is display.");
        verify.verifyElementDisplay(FileName,"GroupEventImage");
        performAction.pause(2);
    }

    //@Test
    public void TC_157() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(15);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        methods.log("Verify event image is display.");
        verify.verifyElementDisplay(FileName,"GroupEventImage");
        performAction.pause(2);
    }

    @Test
    public void TC_159() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        methods.log("Verify event location is display.");
        verify.verifyElementDisplay(FileName,"GroupEventLocation");
        performAction.getText(FileName,"GroupEventLocation");
        performAction.pause(2);
    }

    @Test
    public void TC_160() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");

        String EventName = performAction.getText(FileName, "GroupEventDetailPage");

        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        String EventLocation = performAction.getText(FileName,"GroupEventLocation");
        performAction.pause(2);

        methods.log("Verify event location pin is display.");
        verify.verifyEventPinDisplay(EventName, EventLocation);
        performAction.pause(2);
    }

    @Test
    public void TC_163() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);

        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);

        methods.log("Verify RSVP button is display.");
        verify.verifyElementDisplay(FileName, "RSVPButton");
        performAction.pause(2);
    }

    //Group Event RSVP

    @Test
    public void TC_165() {
        VerifyCommunity verify = new VerifyCommunity(driver);
        Steps step=new Steps(driver);
        Methods methods = new Methods(driver);
        performAction.pause(10);
        performAction.click(FileName,"MenuLink");
        performAction.pause(3);
        performAction.click(FileName,"CommunityMenu");
        performAction.pause(10);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"CommunityGroupDetail");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"GroupEvent");
        performAction.pause(5);
        performAction.androidScrollToElement(50);
        performAction.pause(2);
        performAction.click(FileName,"RSVPButton");
        performAction.pause(2);

        methods.log("Verify Free Registration page is display.");
        verify.verifyElementDisplay(FileName, "FreeRegistration");
        performAction.pause(2);
    }
}
