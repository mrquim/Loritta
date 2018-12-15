package com.mrpowergamerbr.loritta.utils.locale

import com.mrpowergamerbr.loritta.utils.f
import com.mrpowergamerbr.loritta.utils.loritta
import mu.KotlinLogging
import java.text.MessageFormat
import java.util.*

/**
 * Localization class, this is partly generated by the LocaleGenerator
 */
open class BaseLocale {
	companion object {
		@JvmStatic
		private val logger = KotlinLogging.logger {}

		/**
		 * Returns the Java Locale (used for dates, etc) for the specified [lcoale]
		 */
		fun toJavaLocale(locale: BaseLocale): Locale {
			val localeId = loritta.locales.entries.first { it.value == locale }.key

			return Locale(
					when (localeId) {
						"default" -> "pt_BR"
						"pt-pt" -> "pt_PT"
						"en-us" -> "en_US"
						"es-es" -> "es_ES"
						else -> "pt_BR"
					}
			)
		}
	}

	@Transient
	@Deprecated("Please use the inner classes")
	var strings = mutableMapOf<String, String>()
	@Transient
	var commands = Commands()
	@Transient
	var loritta = Loritta()
	@Transient
	var discord = Discord()
	@Transient
	var modules = Modules()

	@Deprecated("Please use the inner classes")
	operator fun get(key: String, vararg arguments: Any?): String {
		if (!strings.containsKey(key)) {
			logger.warn { "Missing translation key! $key" }
			return key
		}
		return strings[key]!!.f(*arguments)
	}

	/**
	 * Gets and formats an message
	 *
	 * @param args  the arguments
	 * @param block the message
	 *
	 * @return      the formatted message
	 */
	fun <T> format(vararg args: Any?, block: BaseLocale.() -> T): T {
		val result = block.invoke(this)
		return when (result) {
			is String -> MessageFormat.format(result, *args) as T
			is List<*> -> result.map { MessageFormat.format(it.toString(), *args) } as T
			else -> throw UnsupportedOperationException("Can't parse $result in BaseLocale!")
		}
	}

	// Generic
	lateinit var SHIP_valor90: List<String>

	lateinit var SHIP_valor80: List<String>

	lateinit var SHIP_valor70: List<String>

	lateinit var SHIP_valor60: List<String>

	lateinit var SHIP_valor50: List<String>

	lateinit var SHIP_valor40: List<String>

	lateinit var SHIP_valor30: List<String>

	lateinit var SHIP_valor20: List<String>

	lateinit var SHIP_valor10: List<String>

	lateinit var SHIP_valor0: List<String>

	// !!!       DO NOT EDIT        !!!
	// ===[ AUTO GENEREATED LOCALE ]===
	class Loritta {
		lateinit var translationAuthors: List<String>
		lateinit var xOfX: String
		lateinit var page: String
		lateinit var youAreCurrentlyOnPage: String
		class Pronoun {
			lateinit var he: String
			lateinit var she: String
		}
		var pronoun = Pronoun()

	}
	class Discord {
		class Status {
			lateinit var online: String
			lateinit var idle: String
			lateinit var doNotDisturb: String
			lateinit var offline: String
		}
		var status = Status()

		class Permissions {
			lateinit var kickMembers: String
			lateinit var banMembers: String
			lateinit var administrator: String
			lateinit var manageChannel: String
			lateinit var manageServer: String
			lateinit var addReactions: String
			lateinit var messageHistory: String
			lateinit var viewAuditLogs: String
			lateinit var messageRead: String
			lateinit var messageWrite: String
			lateinit var messageManage: String
			lateinit var messageExtEmoji: String
			lateinit var messageEmbedLinks: String
			lateinit var manageRoles: String
			lateinit var managePermissions: String
			lateinit var manageWebhooks: String
			lateinit var manageEmotes: String
			lateinit var createInstantInvite: String
			lateinit var prioritySpeaker: String
			lateinit var connect: String
			lateinit var speak: String
			lateinit var muteVoiceMembers: String
			lateinit var disableVoiceAudio: String
			lateinit var moveVoiceMembers: String
			lateinit var useVoiceDetection: String
			lateinit var changeNickname: String
			lateinit var manageNicknames: String
			lateinit var mentionEveryone: String
			lateinit var attachFiles: String
			lateinit var messageTts: String
			lateinit var viewChannel: String
		}
		var permissions = Permissions()

	}
	class Modules {
		class MemberCounter {
			lateinit var auditLogReason: String
		}
		var memberCounter = MemberCounter()

	}
	class Commands {
		lateinit var pleaseWaitCooldown: String
		lateinit var errorWhileExecutingCommand: String
		lateinit var cantUseInPrivate: String
		lateinit var userDoesNotExists: String
		lateinit var doesntHavePermissionDiscord: String
		lateinit var loriDoesntHavePermissionDiscord: String
		lateinit var commandOnlyForOwner: String
		lateinit var imageTooLarge: String
		class Arguments {
			lateinit var text: String
			lateinit var number: String
			lateinit var user: String
			lateinit var emote: String
			lateinit var image: String
		}
		var arguments = Arguments()

		class Entertainment {
			class Roll {
				lateinit var description: String
				lateinit var howMuchSides: String
			}
			var roll = Roll()

			class Vieirinha {
				lateinit var description: String
				lateinit var examples: List<String>
				lateinit var responses: List<String>
			}
			var vieirinha = Vieirinha()

			class Bolsonaro {
				lateinit var description: String
			}
			var bolsonaro = Bolsonaro()

			class VemDeZap {
				lateinit var description: String
				lateinit var examples: List<String>
			}
			var vemDeZap = VemDeZap()

		}
		var entertainment = Entertainment()

		class Images {
			class BolsoDrake {
				lateinit var description: String
			}
			var bolsoDrake = BolsoDrake()

			class DrawnMaskSign {
				lateinit var description: String
			}
			var drawnMaskSign = DrawnMaskSign()

		}
		var images = Images()

		class Actions {
			lateinit var examples: List<String>
			class Slap {
				lateinit var description: String
				lateinit var response: String
				lateinit var responseAntiIdiot: String
			}
			var slap = Slap()

			class Kiss {
				lateinit var description: String
				lateinit var response: String
				lateinit var responseAntiIdiot: String
			}
			var kiss = Kiss()

			class Attack {
				lateinit var description: String
				lateinit var response: String
				lateinit var responseAntiIdiot: String
			}
			var attack = Attack()

			class Hug {
				lateinit var description: String
				lateinit var response: String
			}
			var hug = Hug()

			class Dance {
				lateinit var description: String
				lateinit var response: String
			}
			var dance = Dance()

		}
		var actions = Actions()

		class Moderation {
			class Unmute {
				lateinit var punishAction: String
				lateinit var punishName: String
				lateinit var sucessfullyUnmuted: String
				lateinit var automaticallyExpired: String
			}
			var unmute = Unmute()

			class Lock {
				lateinit var description: String
				lateinit var denied: String
				lateinit var allowed: String
			}
			var lock = Lock()

			class Unlock {
				lateinit var description: String
			}
			var unlock = Unlock()

		}
		var moderation = Moderation()

		class Social {
			class Reputation {
				lateinit var success: String
			}
			var reputation = Reputation()

		}
		var social = Social()

		class Discord {
			class AddEmoji {
				lateinit var description: String
				lateinit var success: String
				lateinit var limitReached: String
				lateinit var error: String
			}
			var addEmoji = AddEmoji()

			class UserInfo {
				lateinit var sharedServers: String
				lateinit var accountCreated: String
				lateinit var accountJoined: String
				lateinit var joinPosition: String
				lateinit var permissions: String
				lateinit var joinPlace: String
			}
			var userInfo = UserInfo()

			class EmojiInfo {
				lateinit var description: String
				lateinit var aboutEmoji: String
				lateinit var emojiName: String
				lateinit var emojiId: String
				lateinit var mention: String
				lateinit var emojiCreated: String
				lateinit var seenAt: String
			}
			var emojiInfo = EmojiInfo()

			class OldMembers {
				lateinit var description: String
				lateinit var theOldestPeople: String
			}
			var oldMembers = OldMembers()

			class ChannelInfo {
				lateinit var description: String
				lateinit var channelMention: String
				lateinit var channelCreated: String
				lateinit var channelTopic: String
				lateinit var undefined: String
				lateinit var channelNotFound: String
			}
			var channelInfo = ChannelInfo()

			class Emoji {
				lateinit var notFoundId: String
			}
			var emoji = Emoji()

		}
		var discord = Discord()

		class Economy {
			class Raffle {
				lateinit var quantityBiggerThanAllowed: String
				lateinit var hasTooManyTickets: String
				lateinit var cantBuyTooManyTickets: String
			}
			var raffle = Raffle()

		}
		var economy = Economy()

		class Miscellaneous {
			class Ajuda {
				lateinit var errorWhileOpeningDm: String
			}
			var ajuda = Ajuda()

			class FanArts {
				lateinit var description: String
				lateinit var madeBy: String
				lateinit var thankYouAll: String
			}
			var fanArts = FanArts()

			class Language {
				lateinit var description: String
				lateinit var pleaseSelectYourLanguage: String
				lateinit var translatedBy: String
				lateinit var languageChanged: String
			}
			var language = Language()

		}
		var miscellaneous = Miscellaneous()

	}
	// ===[ END  GENEREATED LOCALE ]===
	// !!!       DO NOT EDIT        !!!
}
