package net.perfectdreams.loritta.modules

import com.mrpowergamerbr.loritta.dao.Profile
import com.mrpowergamerbr.loritta.events.LorittaMessageEvent
import com.mrpowergamerbr.loritta.modules.MessageReceivedModule
import com.mrpowergamerbr.loritta.userdata.MongoServerConfig
import com.mrpowergamerbr.loritta.utils.LorittaUser
import com.mrpowergamerbr.loritta.utils.locale.LegacyBaseLocale
import net.perfectdreams.loritta.utils.Emotes

class AddReactionForHeathecliffModule : MessageReceivedModule {
	override fun matches(event: LorittaMessageEvent, lorittaUser: LorittaUser, lorittaProfile: Profile, serverConfig: MongoServerConfig, locale: LegacyBaseLocale): Boolean {
		return event.channel.idLong == 643828343325851648L || event.channel.idLong == 646871435465326592L
	}

	override suspend fun handle(event: LorittaMessageEvent, lorittaUser: LorittaUser, lorittaProfile: Profile, serverConfig: MongoServerConfig, locale: LegacyBaseLocale): Boolean {
		if (event.channel.idLong == 643828343325851648L) {
			if (!event.message.contentRaw.startsWith(">")) {
				event.message.addReaction("\uD83D\uDC4D").queue()
				event.message.addReaction("stonks:643608960720699464").queue()
				event.message.addReaction("baka:473905338220019732").queue()
				event.message.addReaction("❤").queue()
			}
		}

		if (event.channel.idLong == 646871435465326592L) {
			if (25 >= event.message.contentRaw.length) {
				event.message.delete().queue()
				return false
			}

			event.message.addReaction("gato_joinha:593161404937404416").queue()

			val chatStaff = event.guild?.getTextChannelById(643604594114691122L)

			chatStaff?.sendMessage("<@&320608529398497280> <@&300279961686638603> Um formulário foi preenchido por ${event.author.asMention}! ${Emotes.LORI_PAT} ${event.message.jumpUrl}")
					?.queue()
		}

		return false
	}
}