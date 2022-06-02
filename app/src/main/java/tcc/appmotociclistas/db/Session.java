package tcc.appmotociclistas.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Session {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "latitude_I")
    public long LatitudeI;

    @ColumnInfo(name = "longitude_I")
    public long LongitudeI;

    @ColumnInfo(name = "latitude_F")
    public long LatitudeF;

    @ColumnInfo(name = "longitude_F")
    public long LongitudeF;


     @ColumnInfo(name = "acelerometerX")
    public ArrayList<String> aceletometerX;

    @ColumnInfo(name = "acelerometerY")
    public ArrayList<String> aceletometerY;

    @ColumnInfo(name = "acelerometerZ")
    public ArrayList<String> aceletometerZ;

    // fix
    // @ColumnInfo(name = "giroscopioX")
    //    public long[] giroscopioX;
    //
    //    @ColumnInfo(name = "giroscopioY")
    //    public long[] giroscopioY;
    //
    //    @ColumnInfo(name = "giroscopioZ")
    //    public long[] giroscopioZ;

    @ColumnInfo(name = "interval")
    public float interval;

    @ColumnInfo(name = "duration")
    public int duration;
}
