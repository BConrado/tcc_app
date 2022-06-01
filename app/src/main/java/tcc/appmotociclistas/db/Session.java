package tcc.appmotociclistas.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalTime;

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

    // fix
    // @ColumnInfo(name = "acelerometerX")
    //    public long[] aceletometerX;
    //
    //    @ColumnInfo(name = "acelerometerY")
    //    public long[] aceletometerY;
    //
    //    @ColumnInfo(name = "acelerometerZ")
    //    public long[] aceletometerZ;

    // fix
    // @ColumnInfo(name = "giroscopioX")
    //    public long[] giroscopioX;
    //
    //    @ColumnInfo(name = "giroscopioY")
    //    public long[] giroscopioY;
    //
    //    @ColumnInfo(name = "giroscopioZ")
    //    public long[] giroscopioZ;

    @ColumnInfo(name = "seconds")
    public float seconds;
}
