package gundam.gunpla.com.streamline.mainscreen;


import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

import java.util.List;

import gundam.gunpla.com.streamline.helpers.ViewModel;
import gundam.gunpla.com.streamline.model.Automation;

public class MainViewModel extends BaseObservable implements ViewModel,
        AutomationsAdapter.AutomationsAdapterCallBack {

    public ObservableArrayList <Automation> automations = new ObservableArrayList <Automation>();


    public MainViewModel() {


        createTestAutomations();
    }

    private void createTestAutomations(){
        Automation automation = new Automation();
        automation.setType("Cab");
        automation.setTime("9am");
        automation.setDescription("Home to office");

        Automation automationTwo = new Automation();
        automationTwo.setType("Delivery");
        automationTwo.setTime("12:30am");
        automationTwo.setDescription("Feista");

        Automation automationThree = new Automation();
        automationThree.setType("Grocery");
        automationThree.setTime("7+pm");
        automationThree.setDescription("Weekly order of grocerys");

        automations.add(automation);
        automations.add(automationTwo);
        automations.add(automationThree);

    }

    @Override
    public void onItemClicked(Object Object) {

    }
}