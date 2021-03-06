// $Id$
/*
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.craftbook.ic;

/**
 * Represents a self-triggered IC. Self-triggered ICs can think on their own
 * through use of an external clock signal.
 * 
 * @author sk89q
 */
public interface SelfTriggeredIC {
    /**
     * Method is called when the IC "thinks" (as triggered by an external
     * clock signal). The given state allows for accessing the data available
     * on the pins.
     * 
     * @param state
     */
    public void think(ChipState state);
}
