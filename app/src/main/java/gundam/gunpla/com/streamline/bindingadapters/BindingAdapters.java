package gundam.gunpla.com.streamline.bindingadapters;

import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import gundam.gunpla.com.streamline.mainscreen.AutomationsAdapter;

public class BindingAdapters {


    @BindingAdapter({"items", "callback"})
    public static void bindRV(RecyclerView recyclerView,
                              List<Object> items,
                              AutomationsAdapter.AutomationsAdapterCallBack automationsAdapterCallBack) {

        AutomationsAdapter adapter = null;

        if (items != null) {
            adapter = new AutomationsAdapter(items);
            adapter.setCallBack(automationsAdapterCallBack);
        }
        bindAdapter(recyclerView, adapter);
    }

    @BindingAdapter("adapter")
    public static void bindAdapter(@NonNull RecyclerView recyclerView, @Nullable RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }


}
