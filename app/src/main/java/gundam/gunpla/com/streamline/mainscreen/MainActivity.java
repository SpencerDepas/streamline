package gundam.gunpla.com.streamline.mainscreen;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import gundam.gunpla.com.streamline.R;
import gundam.gunpla.com.streamline.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        createViewModel();

        setActionBar();

        binding.setVm(viewModel);
    }

    private void setActionBar(){
        setTitle("Monday");
    }

    private void createViewModel() {
        viewModel = new MainViewModel();
    }
}
