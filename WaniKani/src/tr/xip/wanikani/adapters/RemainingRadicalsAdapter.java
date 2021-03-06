package tr.xip.wanikani.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import tr.xip.wanikani.R;
import tr.xip.wanikani.api.response.RadicalItem;
import tr.xip.wanikani.utils.Fonts;

/**
 * Created by Hikari on 9/18/14.
 */
public class RemainingRadicalsAdapter extends ArrayAdapter<RadicalItem> {

    View rootView;
    Context context;

    List<RadicalItem> mList;

    public RemainingRadicalsAdapter(Context context, int resource, List<RadicalItem> objects) {
        super(context, resource, objects);
        this.context = context;
        mList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RadicalItem item = mList.get(position);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rootView = inflater.inflate(R.layout.item_radical_remaining, null);
        }

        TextView mChar = (TextView) rootView.findViewById(R.id.item_radical_character);
        ImageView mCharImage = (ImageView) rootView.findViewById(R.id.item_radical_character_image);

        if (item.getImage() == null) {
            mChar.setText(item.getCharacter());
            mChar.setTypeface(new Fonts().getKanjiFont(context));
            mChar.setVisibility(View.VISIBLE);
            mCharImage.setVisibility(View.GONE);
        } else {
            Picasso.with(context)
                    .load(item.getImage())
                    .into(mCharImage);
            mChar.setVisibility(View.GONE);
            mCharImage.setVisibility(View.VISIBLE);
        }

        return rootView;
    }
}
