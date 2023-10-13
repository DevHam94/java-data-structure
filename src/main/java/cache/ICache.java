package cache;

public interface ICache<K, V> {
    void put(K key, V value);   // 캐시에 데이터를 저장
    V get(K key);               // 캐시에서 데이터를 조회
    boolean delete(K key);      // 키에 해당하는 데이터를 삭제
    int size();                 // 현재 캐시 사이즈를 반환
}
