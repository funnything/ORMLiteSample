package jp.funnything.ormlite.sample.entity;

import com.j256.ormlite.field.DatabaseFieldId;
import com.j256.ormlite.field.DatabaseFieldSimple;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class OtherEntity {
    @DatabaseFieldSimple
    @DatabaseFieldId( generatedId = true )
    public int id;

    @DatabaseFieldSimple
    public String name;
}
