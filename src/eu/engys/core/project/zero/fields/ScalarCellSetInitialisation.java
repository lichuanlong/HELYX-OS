/*******************************************************************************
 *  |       o                                                                   |
 *  |    o     o       | HELYX-OS: The Open Source GUI for OpenFOAM             |
 *  |   o   O   o      | Copyright (C) 2012-2016 ENGYS                          |
 *  |    o     o       | http://www.engys.com                                   |
 *  |       o          |                                                        |
 *  |---------------------------------------------------------------------------|
 *  |   License                                                                 |
 *  |   This file is part of HELYX-OS.                                          |
 *  |                                                                           |
 *  |   HELYX-OS is free software; you can redistribute it and/or modify it     |
 *  |   under the terms of the GNU General Public License as published by the   |
 *  |   Free Software Foundation; either version 2 of the License, or (at your  |
 *  |   option) any later version.                                              |
 *  |                                                                           |
 *  |   HELYX-OS is distributed in the hope that it will be useful, but WITHOUT |
 *  |   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or   |
 *  |   FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License   |
 *  |   for more details.                                                       |
 *  |                                                                           |
 *  |   You should have received a copy of the GNU General Public License       |
 *  |   along with HELYX-OS; if not, write to the Free Software Foundation,     |
 *  |   Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA            |
 *******************************************************************************/
package eu.engys.core.project.zero.fields;

import java.util.ArrayList;
import java.util.List;

public class ScalarCellSetInitialisation extends CellSetInitialisation {

    private static final int DEFAULT_DEFAULT_VALUE = 0;
    
    private double defaultValue = DEFAULT_DEFAULT_VALUE;
    private List<ScalarSurface> surfaces = new ArrayList<>();
    
    public ScalarCellSetInitialisation() {super();}
    
    public ScalarCellSetInitialisation(double defaulValue) {
        super();
        this.defaultValue = defaulValue;
    }
    
    public ScalarCellSetInitialisation(double defaulValue, List<ScalarSurface> surfaces) {
        this.defaultValue = defaulValue;
        this.surfaces.addAll(surfaces);
    }
    
    public double getDefaultValue() {
        return defaultValue;
    }
    public void setDefaultValue(double defaultValue) {
        firePropertyChange(DEFAULT_VALUE_KEY, this.defaultValue, this.defaultValue = defaultValue);
    }

    public List<ScalarSurface> getSurfaces() {
        return surfaces;
    }
    public void setSurfaces(List<ScalarSurface> surfaces) {
        this.surfaces = surfaces;
    }
    
    public String toString() {
        return "ScalarCellSet: " + surfaces;
    }
}
