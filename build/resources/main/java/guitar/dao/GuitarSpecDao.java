package java.guitar.dao;

import java.guitar.entity.GuitarSpec;

public interface GuitarSpecDao {
	/**
	 * ��������
	 * @param guitarSpec
	 * @return
	 */
	public GuitarSpec queryGuitarSpec(GuitarSpec guitarSpec);
	/**
	 * ���ݱ�Ų�������
	 * @param serialNumber
	 * @return
	 */
	public GuitarSpec queryGuitarSpecByserialNumber(String serialNumber);
}
