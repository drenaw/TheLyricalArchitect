package com.example.root.thelyricalarchitect;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.WindowDecorActionBar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 2/7/16.
 */
public class SongAdapter extends BaseAdapter{

    private ArrayList<Song> songs;
    private LayoutInflater layoutInflater;
    private Context mContext;
    private Song tempSong = null;

    public SongAdapter(Context c, ArrayList<Song> songs) {
        this.songs = songs;
        layoutInflater = LayoutInflater.from(c);
        mContext=c;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Song getItem(int i) {
        return songs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Song currentSong = getItem(i);

        ViewHolder holder;
        if(view == null){
            view = layoutInflater.inflate(R.layout.song,viewGroup,false);
            holder = new ViewHolder();
            holder.albumArtImage = (ImageView)view.findViewById(R.id.song_album_art);
            holder.tileText = (TextView)view.findViewById(R.id.song_title);
            holder.artistText = (TextView)view.findViewById(R.id.song_artist);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }

        /*holder.albumArtImage.setImageResource(R.drawable.ic_audio_file);
        holder.tileText.setText(currentSong.getTitle());
        holder.artistText.setText(currentSong.getArtist());*/

        if(songs.size()<=0){
            holder.tileText.setText("NO MOFO DATA");
        }else{
            tempSong = null;
            tempSong = songs.get(i);
            holder.albumArtImage.setImageBitmap(tempSong.getAlbumArt());
            holder.tileText.setText(tempSong.getTitle());
            holder.artistText.setText(tempSong.getArtist());




        }

        return view;

    }

    public static class ViewHolder{
        ImageView albumArtImage;
        TextView tileText;
        TextView artistText;
    }

}
