package com.example.hsmicrofinance.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hsmicrofinance.databinding.FragmentBasicDepositHistoryBinding;


public class BasicDepositHistory extends Fragment {

    FragmentBasicDepositHistoryBinding mFragmentBasicDepositHistoryBinding;
    private RecyclerView mRecyclerView;



    public BasicDepositHistory() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mFragmentBasicDepositHistoryBinding = FragmentBasicDepositHistoryBinding.inflate(inflater,container,false);
        return mFragmentBasicDepositHistoryBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}