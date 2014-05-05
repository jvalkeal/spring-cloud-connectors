package org.springframework.cloud.heroku;

import org.springframework.cloud.service.common.MysqlServiceInfo;

/**
 * 
 * @author Ramnivas Laddad
 *
 */
public class MysqlServiceInfoCreator extends RelationalServiceInfoCreator<MysqlServiceInfo> {

	public MysqlServiceInfoCreator() {
		super("mysql");
	}

	@Override
	public MysqlServiceInfo createServiceInfo(String id, String uri) {
		return new MysqlServiceInfo("mysql-service", uri);
	}

    @Override
    public String[] getEnvPrefixes() {
        return new String[]{"CLEARDB_DATABASE_URL"};
    }
}
