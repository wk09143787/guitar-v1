package java.guitar.dao;

import java.guitar.entity.Guitar;
import java.util.List;


public interface GuitarDao {

	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Guitar> getAll();
	/**
	 * ���ݱ�Ų�ѯ����
	 * @param serialNumber
	 * @return
	 */
	public Guitar getBySerialNumber(String serialNumber);
}