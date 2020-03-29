package in.thirumal.persistence.model;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * Generated using erm-postgresql-spring-boot project
 * @see <a href="https://github.com/M-Thirumal/erm-postgresql-spring-boot">erm-postgresql-spring-boot</a>
 * @author erm-postgresql-spring-boot
 * @since 2020-03-29
 * @version 1.0
 */
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@ToString@Builder
@EqualsAndHashCode
public class PartyName implements java.io.Serializable  {

	private static final long serialVersionUID = 1L;

	//Declaring fields
	private Long partyNameId;
	private Integer partyId;
	private Integer genericCd;
	private String genericLocale;
	private String firstName;
	private String restOfName;
	private OffsetDateTime startTime;
	private OffsetDateTime endTime;
	private Boolean preferred;
	private OffsetDateTime rowCreationTime;
	private OffsetDateTime rowUpdateTime;
	private String rowUpdateInfo;

	//TODO hashcode & equals method
}