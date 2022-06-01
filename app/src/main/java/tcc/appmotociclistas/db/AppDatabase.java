package tcc.appmotociclistas.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Context;

@Database(entities = Session.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract SessionDao sessionDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context){
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "AppDataBase").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }


}
