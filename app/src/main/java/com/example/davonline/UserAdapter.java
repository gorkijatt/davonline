package com.example.davonline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder>{
    Context mainActivity;
    List<UserModel> userModelList;

    public UserAdapter(Context mainActivity, List<UserModel> userModelList){
      this.mainActivity = mainActivity;
      this.userModelList = userModelList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(LayoutInflater.from(mainActivity).inflate(R.layout.item_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
      holder.itemtext.setText(userModelList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    class UserHolder extends RecyclerView.ViewHolder {
        TextView itemtext;
        public UserHolder(@NonNull @NotNull View itemView){
            super(itemView);
            itemtext = itemView.findViewById(R.id.itemText);
        }
    }
}
