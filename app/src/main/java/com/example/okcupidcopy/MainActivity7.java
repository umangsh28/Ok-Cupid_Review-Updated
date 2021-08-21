package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {
    private CardStackLayoutManager manager;
    private CardStackAdapter adapter;
    private ImageView firstImage;
    private ImageView secondImage;
    private ImageView thirdImage;
    private ImageView forthImage;
    private ImageView fivethImage;
    private ImageView sixthImage;
    private ImageView eighthImage;
    private ImageView heart;
    private ImageView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        firstImage=findViewById(R.id.circle1);
        secondImage=findViewById(R.id.circle2);
        thirdImage=findViewById(R.id.circle3);
        heart=findViewById(R.id.heart);
        message=findViewById(R.id.msg);
        forthImage=findViewById(R.id.circle4);
        fivethImage=findViewById(R.id.circle5);
        sixthImage=findViewById(R.id.circle6);
        eighthImage=findViewById(R.id.circle8);
        CardStackView cardStackView=findViewById(R.id.card_stack_view);
        manager=new CardStackLayoutManager(this, new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {


            }

            @Override
            public void onCardSwiped(Direction direction) {

            }

            @Override
            public void onCardRewound() {

            }

            @Override
            public void onCardCanceled() {

            }

            @Override
            public void onCardAppeared(View view, int position) {

            }

            @Override
            public void onCardDisappeared(View view, int position) {

            }
        });
        manager.setStackFrom(StackFrom.None);
        manager.setVisibleCount(3);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(20.0f);
        manager.setDirections(Direction.HORIZONTAL);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        manager.setOverlayInterpolator(new LinearInterpolator());
        adapter=new CardStackAdapter(addList());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,LikesActivity.class);
                startActivity(intent);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MessagesActivity.class);
                startActivity(intent);
            }
        });
        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        forthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        fivethImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        sixthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        eighthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity8.class);
                startActivity(intent);
            }
        });
    }

    private List<ItemModel> addList() {
        List<ItemModel> itemModelList=new ArrayList<>();
        for(int i=0;i<5;i++){
            itemModelList.add(new ItemModel(R.drawable.somaya,"Somaya",32,"Maharastra","80%","I love simplicity and honesty"));
            itemModelList.add(new ItemModel(R.drawable.naira,"Naira",25,"Delhi","87%","I am available only for a genuine man... "));
            itemModelList.add(new ItemModel(R.drawable.mona,"Mona",22,"Mumbai","65%","Here to find cool people. "));
            itemModelList.add(new ItemModel(R.drawable.vedram,"Vedram",26,"Banguluru","68%","Let's enjoy each and every moment of life."));
            itemModelList.add(new ItemModel(R.drawable.mahi,"Mahi",24,"Pune","50%","I am a student and i love to play chess."));
            itemModelList.add(new ItemModel(R.drawable.sarukh,"Sarukh",27,"Delhi","40%","In Love with music n reading ."));
            itemModelList.add(new ItemModel(R.drawable.sonam,"Sonam",23,"Mumbai","60%","Young, wild and free "));
            itemModelList.add(new ItemModel(R.drawable.sonali,"Sonali",22,"Banguluru","68%","Don't ping if you type lyk diz "));
        }
        return itemModelList;
    }
}