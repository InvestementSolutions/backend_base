package com.example.corebase.entity;

import com.example.corebase.entity.base.PrimaryBase;
import com.example.corebase.infrastructure.constant.ActiveStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RoleObject extends PrimaryBase {

    @ManyToOne
    @JoinColumn(name = "object_id")
    private Objects objectsId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles rolesId;

    @Column(name = "is_active")
    private ActiveStatus isActive;
}
