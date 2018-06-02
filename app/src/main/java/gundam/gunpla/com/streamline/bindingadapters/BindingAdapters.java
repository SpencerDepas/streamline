package gundam.gunpla.com.streamline.bindingadapters;

import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import gundam.gunpla.com.streamline.mainscreen.AutomationsAdapter;
import gundam.gunpla.com.streamline.model.Automation;

public class BindingAdapters {


    @BindingAdapter({"items", "callback"})
    public static void bindRV(RecyclerView recyclerView,
                              List<Automation> items,
                              AutomationsAdapter.AutomationsAdapterCallBack automationsAdapterCallBack) {

        AutomationsAdapter adapter = null;

        if (items != null) {
            adapter = new AutomationsAdapter(items);
            adapter.setCallBack(automationsAdapterCallBack);
        }
        bindAdapter(recyclerView, adapter);
    }

    @BindingAdapter("layout_vertical")
    public static void bindLayoutManager(@NonNull RecyclerView recyclerView, boolean vertical) {
        int orientation = vertical ? RecyclerView.VERTICAL : RecyclerView.HORIZONTAL;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), orientation, false));
    }
    
    @BindingAdapter("adapter")
    public static void bindAdapter(@NonNull RecyclerView recyclerView, @Nullable RecyclerView.Adapter adapter) {
        recyclerView.setAdapter(adapter);
    }


}
