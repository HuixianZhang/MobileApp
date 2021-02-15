package com.example.numad20f_huixianzhang;

import android.util.Patterns;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.net.Uri;

import static androidx.core.content.ContextCompat.startActivity;


public class RviewHolder extends RecyclerView.ViewHolder {
    public ImageView itemIcon;
    public EditText itemName;
    public EditText itemDesc;
    public CheckBox checkBox;
    public Button buttonSave;
    public Button buttonGo;
//    public Button buttonGo;

//    private String getValue() {
//        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
//        String savedValue = sharedPref.getString(KEY, ""); //the 2 argument return default value
//
//        return savedValue;
//    }
//
//    private SharedPreferences getPreferences(int modePrivate) {
//    }
//
//    private void saveFromEditText(String text) {
//        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putString(KEY, text);
//        editor.apply();
//    }
//    private void saveFromEditText(String text) {
//        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPref.edit();
//        editor.putString(KEY, text);
//        editor.apply();
//    }

    public RviewHolder(View itemView, final ItemClickListener listener) {
        super(itemView);
        itemIcon = itemView.findViewById(R.id.item_icon);
        itemName = (EditText) itemView.findViewById(R.id.item_name);
        itemDesc = (EditText) itemView.findViewById(R.id.item_desc);
        checkBox = itemView.findViewById(R.id.checkbox);
        buttonSave = itemView.findViewById(R.id.buttonsave);
        buttonGo = itemView.findViewById(R.id.buttongo);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getLayoutPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        listener.onItemClick(position);
                    }
                }
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getLayoutPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onCheckBoxClick(position);
                    }
                }
            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getLayoutPosition();
                    if (position != RecyclerView.NO_POSITION) {
//                        String URL = itemName.getText().toString();
//                        Intent intent = new Intent(Intent.ACTION_VIEW, URL);
//                        startActivity(intent);
//                        saveFromEditText(editText.getText().toString());
//                        Toast.makeText(v.getContext(),position+"",Toast.LENGTH_LONG).show();
                        Toast.makeText(v.getContext(),"Saved successfully",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getLayoutPosition();
                    if (position != RecyclerView.NO_POSITION) {
//                        Toast.makeText(v.getContext(),"Go successfully",Toast.LENGTH_LONG).show();
                        String URL = itemName.getText().toString();
                        Uri uri = Uri.parse(URL);
                        if (!Patterns.WEB_URL.matcher(URL).matches()) {
                            //validation msg
                            Toast.makeText(v.getContext(),"Link not avaliable",Toast.LENGTH_LONG).show();
                            return;
                        }
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        v.getContext().startActivity(intent);

//                        Patterns.WEB_URL.matcher(uri).matches();

//                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                        v.getContext().startActivity(intent);

                    }
                }
            }
        });

//        buttonGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (listener != null) {
//                    int position = getLayoutPosition();
//                    if (position != RecyclerView.NO_POSITION) {
////                        String URL = itemName.getText().toString();
////                        Intent intent = new Intent(Intent.ACTION_VIEW, URL);
////                        startActivity(intent);
////                        saveFromEditText(editText.getText().toString());
////                        Toast.makeText(v.getContext(),position+"",Toast.LENGTH_LONG).show();
//                        Toast.makeText(v.getContext(),"Go successfully",Toast.LENGTH_LONG).show();
//                    }
//                }
//            }
//        });
    }
}
