/*
 * Copyright (c) 2014 Dries007
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted (subject to the limitations in the
 * disclaimer below) provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the
 *    distribution.
 *
 *  * Neither the name of Dries007 nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE
 * GRANTED BY THIS LICENSE.  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT
 * HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.dries007.tfcnei;

import codechicken.nei.api.API;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.dries007.tfcnei.recipeHandlers.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;

/**
 * @author Dries007
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void preinit()
    {
        super.preinit();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void tickEvent(WorldEvent.Load loadEvent)
    {
        API.registerRecipeHandler(new AnvilRecipeHandler());
        API.registerUsageHandler(new AnvilRecipeHandler());

        API.registerRecipeHandler(new QuernRecipeHandler());
        API.registerUsageHandler(new QuernRecipeHandler());

        API.registerRecipeHandler(new KilnRecipeHandler());
        API.registerUsageHandler(new KilnRecipeHandler());

        API.registerRecipeHandler(new LoomRecipeHandler());
        API.registerUsageHandler(new LoomRecipeHandler());

        API.registerRecipeHandler(new KnappingRecipeHandler());
        API.registerUsageHandler(new KnappingRecipeHandler());

        API.registerRecipeHandler(new BarrelRecipeHandler());
        API.registerUsageHandler(new BarrelRecipeHandler());
    }
}
