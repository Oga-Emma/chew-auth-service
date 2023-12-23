package app.seven.chew.auth.model

import app.seven.chew.user.model.User
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "auth_users")
data class AuthUser (

    @Id
    var id: UUID? = null,

    @Column(nullable = false)
    var password: String,

    @Column(nullable = true)
    var refreshToken: String? = null,

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    var user: User
)