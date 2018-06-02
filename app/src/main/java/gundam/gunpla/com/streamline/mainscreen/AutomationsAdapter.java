package gundam.gunpla.com.streamline.mainscreen;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;

import java.util.List;

import gundam.gunpla.com.streamline.R;
import gundam.gunpla.com.streamline.model.Automation;


public class AutomationsAdapter extends RecyclerView.Adapter<AutomationsAdapter.CustomViewHolder> {


    private static final int VIEW_TAXI = 0;
    private static final int VIEW_FOOD_DELIVERY = 1;
    private static final int VIEW_FOOD_GROCERY = 2;

    private final
    @NonNull
    List<Automation> items;
    private AutomationsAdapterCallBack automationsAdapterCallBack;

    public AutomationsAdapter(@NonNull List<Automation> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        if(viewType == VIEW_TAXI) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater,
                    R.layout.automation_taxi_adapter_item, parent, false);
            return new CustomViewHolder(binding);
        } else if(viewType == VIEW_FOOD_DELIVERY) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater,
                    R.layout.automotion_food_adapter_item, parent, false);
            return new CustomViewHolder(binding);
        }else{
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater,
                    R.layout.automation_grocery_adapter_item, parent, false);
            return new CustomViewHolder(binding);
        }
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {


        Automation obj = items.get(position);
        holder.bind(obj);


    }

    @Override
    public int getItemViewType(int position) {
        if(items != null && items.get(position).getType().equals(Automation.VIEW_TAXI)) {
            return VIEW_TAXI;
        } else if(items != null && items.get(position).getType().equals(Automation.VIEW_FOOD_DELIVERY)) {
            return VIEW_FOOD_DELIVERY;
        }else{
            return VIEW_FOOD_GROCERY;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        public CustomViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Automation item) {
            binding.setVariable(BR.item, item);
            binding.executePendingBindings();
        }
    }

    public interface AutomationsAdapterCallBack {
        void onItemClicked(Object Object);

    }

    public void setCallBack(AutomationsAdapterCallBack automationsAdapterCallBack) {
        this.automationsAdapterCallBack = automationsAdapterCallBack;
    }
}
