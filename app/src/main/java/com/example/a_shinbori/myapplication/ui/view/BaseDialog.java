package com.example.a_shinbori.myapplication.ui.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.a_shinbori.myapplication.R;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class BaseDialog extends DialogFragment {

    public final static int BUTTON_ID_POSITIVE = 1;
    public final static int BUTTON_ID_NEGATIVE = 2;

    private String messageTxt = "(Message none)";
    private String positiveButtonTxt = "(positive)";
    private String negativeButtonTxt = "(negative)";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(messageTxt)
                .setPositiveButton(positiveButtonTxt, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                        BaseDialog.this.onClickPositive();
                    }
                })
                .setNegativeButton(negativeButtonTxt, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        BaseDialog.this.onClickNegative();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

    public void setup(String messageText, String positiveButtonText, String negativeButtonText) {
        messageTxt = messageText;
        positiveButtonTxt = positiveButtonText;
        negativeButtonTxt = negativeButtonText;
    }

    protected void onClickPositive() {
    }

    protected void onClickNegative() {
    }
}
