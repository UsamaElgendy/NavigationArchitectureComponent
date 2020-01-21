package com.elgindy.navigationarchitecturecomponentpractice1;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public SecondFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SecondFragmentArgs secondFragmentArgs = SecondFragmentArgs.fromBundle(getArguments());
        String userName = secondFragmentArgs.getName();

        TextView textView = getView().findViewById(R.id.lblName);

        textView.setText(userName);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
