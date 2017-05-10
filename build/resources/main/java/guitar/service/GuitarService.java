package java.guitar.service;

import java.util.List;

import java.guitar.dao.GuitarDao;
import java.guitar.entity.Guitar;

public interface GuitarService {

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
	/**
	 * ע��
	 * @param guitarDao
	 */
	void setGuitarDao(GuitarDao guitarDao);
	
}