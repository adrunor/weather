package local.mika.weather.weather;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import local.mika.weather.R;

public class WeatherAdapter extends Adapter<WeatherAdapter.ViewHolder>{
	
	public class ViewHolder extends RecyclerView.ViewHolder {
		@BindView(R.id.dateWeather)
		TextView dateWeather;
		
		private TextView degreeWeather;
		private ImageView iconWeather;
		
		public ViewHolder(View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
		}
	}
	
	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return null;
	}
	
	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		
	}
	
	@Override
	public int getItemCount() {
		return 0;
	}
}
