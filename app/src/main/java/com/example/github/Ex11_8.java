package com.example.github;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Ex11_8 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex11_6);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
    }

    public class MyGridAdapter extends BaseAdapter {
        Context context;

        public MyGridAdapter(Context c) {
            context = c;
        }

        public int getCount() {
            return posterID.length;
        }

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        Integer[] posterID = { R.drawable.mov01, R.drawable.mov02,
                R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10, R.drawable.mov01,
                R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
                R.drawable.mov05, R.drawable.mov06, R.drawable.mov07,
                R.drawable.mov08, R.drawable.mov09, R.drawable.mov10,
                R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
                R.drawable.mov04, R.drawable.mov05, R.drawable.mov06,
                R.drawable.mov07, R.drawable.mov08, R.drawable.mov09,
                R.drawable.mov10 };
        String[] bigtitle={
                "옥자","가을로","루터","판도라",
                "톰보이","감금","E.T",
                "백두산","블랙팬서","히말라야",
                "옥자","가을로","루터","판도라",
                "톰보이","감금","E.T",
                "백두산","블랙팬서","히말라야",
                "옥자","가을로","루터","판도라",
                "톰보이","감금","E.T",
                "백두산","블랙팬서","히말라야"

        };

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    View dialogView = (View) View.inflate(Ex11_8.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(Ex11_8.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle(bigtitle[pos]);
                    dlg.setIcon(R.drawable.ic_launcher_foreground);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();

                }
            });

            return imageview;
        }

    }
}
