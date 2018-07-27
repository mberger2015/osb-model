package de.evoila.cf.broker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A service plan available for a ServiceDefinition
 * 
 * @author sgreenberg@gopivotal.com
 * @author Johannes Hiemer.
 */
public class Plan {

	private String id;

	private String name;

	private String description;

	private Metadata metadata  = new Metadata();

	private boolean free = true;

	private Schemas schemas;

	/**
	 * Please use metadata section for custom mapping information
	 */
	@Deprecated
	private int volumeSize;

	/**
	 * Please use metadata section for custom mapping information
	 */
	@Deprecated
	private VolumeUnit volumeUnit;

	/**
	 * Please use metadata section for custom mapping information
	 */
	private Platform platform;

	/**
	 * Please use metadata section for custom mapping information
	 */
	@Deprecated
	private String flavorId;

	/**
	 * Please use metadata section for custom mapping information
	 */
	@Deprecated
	private int connections;

	public Plan() {
		super();
	}

	public int getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(int volumeSize) {
		this.volumeSize = volumeSize;
	}

	public VolumeUnit getVolumeUnit() {
		return volumeUnit;
	}

	public void setVolumeUnit(VolumeUnit volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	public Platform getPlatform() {
		return platform;
	}

	@JsonIgnore
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setPlatform(String platform) {
		this.platform = Platform.valueOf(platform);
	}

	public String getFlavorId() {
		return flavorId;
	}

	public void setFlavorId(String flavorId) {
		this.flavorId = flavorId;
	}

	public int getConnections() {
		return connections;
	}

	public void setConnections(int connections) {
		this.connections = connections;
	}

	public Plan(String id, String name, String description, Platform platform, int volumeSize, VolumeUnit volumeUnit,
			String flavorId, boolean free, int connections) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.platform = platform;
		this.volumeSize = volumeSize;
		this.flavorId = flavorId;
		this.connections = connections;
		this.volumeUnit = volumeUnit;
		this.metadata = new Metadata();
	}

	public Plan(String id, String name, String description, Metadata metadata, Platform platform,
			int volumeSize, VolumeUnit volumeUnit, String flavor, boolean free, int connections) {
		this(id, name, description, platform, volumeSize, volumeUnit, flavor, free, connections);
		this.metadata = metadata;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public boolean isFree() {
		return free;
	}
	
	public boolean getFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public Schemas getSchemas() {
		return schemas;
	}

	public void setSchemas(Schemas schemas) {
		this.schemas = schemas;
	}
}
