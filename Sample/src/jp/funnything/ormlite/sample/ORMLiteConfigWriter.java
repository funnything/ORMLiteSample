package jp.funnything.ormlite.sample;

import jp.funnything.ormlite.sample.entity.OtherEntity;
import jp.funnything.ormlite.sample.entity.SomeEntity;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

public class ORMLiteConfigWriter {
    public static void main( final String[] args ) throws Exception {
        OrmLiteConfigUtil.writeConfigFile( "ormlite_config.txt" , new Class< ? >[] { SomeEntity.class , OtherEntity.class } );
    }
}
