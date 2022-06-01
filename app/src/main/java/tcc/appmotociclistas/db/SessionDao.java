package tcc.appmotociclistas.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SessionDao {
    @Query("SELECT * FROM session")
    List<Session> getAllSessions();

    @Insert
    void insertSession(Session... session);

    @Delete
    void deleteSession(Session session);
}
