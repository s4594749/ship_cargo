package portsim.util;

/**
 * A type that can be encoded to a machine-readable string representation,
 * useful for saving objects to files.
 * @ass2
 */
public interface Encodable {
    /**
     * Returns the String representation of the current state of this object.
     *
     * @return encoded String representation
     * @ass2
     */
    String encode();
}
