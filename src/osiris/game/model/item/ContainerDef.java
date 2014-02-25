package osiris.game.model.item;

/*
 * Osiris Emulator
 * Copyright (C) 2011  Garrett Woodard, Blake Beaupain, Travis Burtrum
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

// TODO: Auto-generated Javadoc

/**
 * The Class ContainerDef.
 * 
 * @author Boomer
 * 
 */
public class ContainerDef {

	/**
	 * The type.
	 */
	final int interfaceId, childId, type;

	/**
	 * Instantiates a new container def.
	 * 
	 * @param interfaceId
	 *            the interface id
	 * @param childId
	 *            the child id
	 * @param type
	 *            the type
	 */
	public ContainerDef(int interfaceId, int childId, int type) {
		this.interfaceId = interfaceId;
		this.childId = childId;
		this.type = type;
	}

	/**
	 * Gets the interface id.
	 * 
	 * @return the interface id
	 */
	public final int getInterfaceId() {
		return interfaceId;
	}

	/**
	 * Gets the child id.
	 * 
	 * @return the child id
	 */
	public int getChildId() {
		return childId;
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public int getType() {
		return type;
	}

}
