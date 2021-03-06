package com.xiaobudian.yamikitchen.repository.member;

import com.xiaobudian.yamikitchen.domain.merchant.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Johnson on 2015/4/23.
 */
public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
    public List<UserAddress> findByUid(Long uid);

    public UserAddress findByUidAndIsDefaultTrue(Long uid);

}
