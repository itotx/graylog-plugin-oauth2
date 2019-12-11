/**
 * This file is part of Graylog Plugin Oauth.
 * <p>
 * Graylog Plugin Oauth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * <p>
 * Graylog Plugin Oauth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Foobar. If not, see <https://www.gnu.org/licenses/>
 */

package com.globo.graylog.plugins.oauth2.service;

import org.graylog2.plugin.database.PersistedService;
import org.graylog2.plugin.database.ValidationException;

import java.util.List;

public interface GroupRoleService extends PersistedService {

    List<GroupRoleInterface> loadAll();

    String save(GroupRoleInterface groupRolesInterface) throws ValidationException;

    void remove(String group);
}
