package com.devosha.mrlovelydialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
/*
donationAdapter class. Derives from ArrayAdapter,
 */
public class DonationAdapter extends ArrayAdapter<DonationOption> {

    public DonationAdapter(Context context, List<DonationOption> donationOptions) {
        super(context, 0, donationOptions);
    }

    /*
    Inflate item_donation_option in this getView() method.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_donate_option, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else vh = (ViewHolder) convertView.getTag();

        DonationOption option = getItem(position);

        vh.description.setText(option.description);
        vh.amount.setText(option.amount);

        return convertView;
    }

    /*
    ViewHolder class. To hold description and amount, both TextVoews.
     */
    private static final class ViewHolder {
        TextView description;
        TextView amount;

        public ViewHolder(View v) {
            description = (TextView) v.findViewById(R.id.description);
            amount = (TextView) v.findViewById(R.id.amount);
        }
    }
}
