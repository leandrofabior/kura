/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kura.bluetooth;

import org.eclipse.kura.bluetooth.le.BluetoothLeDevice;
import org.osgi.annotation.versioning.ProviderType;

/**
 * BluetoothDevice represents a Bluetooth device to which connections
 * may be made. The type of Bluetooth device will determine the
 * communications mechanism. Standard Bluetooth devices will use
 * the {@link BluetoothConnector} and Bluetooth LE devices will use
 * {@link BluetoothGatt}.
 * <br>
 * When using {@link BluetoothConnector}, A default connector is not provided
 * and will need to be implemented.
 *
 * @noimplement This interface is not intended to be implemented by clients.
 *
 * @deprecated This class is deprecated in favor of {@link BluetoothLeDevice}
 *
 */
@ProviderType
@Deprecated
public interface BluetoothDevice {

    /**
     * Returns the the name of the Bluetooth device.
     *
     * @return The devices name
     */
    public String getName();

    /**
     * Returns the physical address of the device.
     *
     * @return The physical address of the device
     */
    public String getAdress();

    /**
     * The type of devices, name whether the device supports
     * Bluetooth LE or not.
     *
     * @return The device type
     */
    public int getType();

    /**
     * Return a connector for communicating with a standard
     * Bluetooth device. A default connector is not provided
     * and will need to be implemented.
     *
     * @return Standard Bluetooth connector
     */
    @Deprecated
    public BluetoothConnector getBluetoothConnector();

    /**
     * Return an instance of a Bluetooth GATT server to be
     * used in communicating with Bluetooth LE devices.
     *
     * @return BluetoothGatt
     */
    public BluetoothGatt getBluetoothGatt();

}
