/*
 * Copyright 2013 huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.
 */
package org.jackhuang.hellominecraft.svrmgr.views;

/**
 *
 * @author huangyuhui
 */
public class CommandsWindow extends javax.swing.JDialog {

    /**
     * Creates new form CommandsWindow
     */
    public CommandsWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("--基本\n/register [密码] [确认密码]:注册 (Authme插件)\n/login [密码]:登录 (Authme插件)\n/sethome:设置你自己的家 (Esentials插件)\n/home:回到你自己的家 (Esentials插件)\n/money:查看你有的钱 (iConmey经济插件)\n/back:回到上一个位置 (Esentials插件)\n/tp [玩家名字]:传送到该玩家 需求OP\n/gamemode [玩家姓名] [游戏模式]:给某玩家更换游戏模式\n/ban [玩家名字]:封禁玩家\n/ban-ip [玩家名字]:封禁玩家IP\n/kick [玩家名字]:T出玩家\n/setspawn:设置出生点 (Esentials插件)\n/spawn:查看出生点 (Esentials插件)\n/whitelist add [玩家名字]:添加白名单\n/whitelist remove [玩家名字]:移除白名单\n/op [玩家名字]:给某人op\n/unban [玩家名字]:解除玩家ban (Essentials插件)\n/unbanip [玩家名字]:解除玩家ban-ip (Essentials插件)\n/pardon [玩家名字]:同unban (原版craftbukkit)\n/pardon-ip [玩家名字]:同unbanip (原版craftbukkit)\n/pay [玩家] [钱数] 把自己的游戏币转到其他玩家 (iConmey经济插件)\n/delwarp [地标] :删除传送标 (Essentials插件)\n/give [玩家名字] [物品ID] [数量]:给某人物品\n/petrelease 放生宠物 (MyPet插件)\n/reload 重启服务器\n\n--其他\n/help: 查看帮助命令列表.\n/helpop: 向在线OP发送求助信息.\n/heroicderp: 重新加载配置\n/home: 传送回家.\n/ignore: 忽略某玩家.\n/info: 方块信息工具\n/invsee: 查看某玩家背包.\n/item: 生成一个物品.\n/itemdb: 搜索物品.\n/jails: 显示所有监狱的列表.\n/jump: 传送到视野尽头.\n/jumpto: 跳转到一个地方\n/kick: 把某玩家以某理由从服务器踢出.\n/kickall: 把所有玩家踢出服务器,除了OP.\n/kill: 杀死某个玩家.\n/killall: 杀死这个世界的所有生物.\n/kit: 获得指定的工具包,或查看可用的工具包.\n/kittycannon: 向你的对手扔出一个爆炸的小猫.\n/lift: 检查电梯\n/lightning: 神的力量！让闪电劈到准星处或玩家头顶.\n/list: 查看所有在线的玩家.\n/listchunks: List chunks that your selection includes\n/listgroups: List the groups available.\n/lockette: Access to the Lockette plugin via commands.\n/login: Authenticate yourself as the owner of this player.\n/logout: Manually end your login session.\n/lrbuild: <leftclick block> <rightclick block> - Long-range buil\n/mail: 查看/清除/发送 邮件.\n/manclear: Clear world selection. Next commands will work on you\n/mandemote: Demote a player in the same heritage line to a lower\n/mangadd: Add group to the system.\n/mangaddi: Add a group to another group inheritance list.\n/mangaddp: Add permissions to a group.\n/mangaddv: Add, or replaces, a variable to a group (like prefix\n/mangcheckp: Check if group has a permissions, and where it come\n/mangcheckv: Verify a value of a variable of group, and where it\n/mangdel: Removes group from the system(all it's users become de\n/mangdeli: Remove a group from another group inheritance list.\n/mangdelp: Removes permissions from a group.\n/mangdelv: Remove a variable from a group.\n/manglistp: Lists all permissionss from a group.\n/manglistv: List variables a group has (like prefix or suffix).\n/manload: Reload current world and config.yml. Or load given wor\n/manpromote: Promote a player in the same heritage line to a hig\n/mansave: Save all permissionss on file.\n/manselect: Select a world to work with next commands.\n/mantogglesave: Toggle on/off the autosave.\n/mantogglevalidate: Toggle on/off the validating if player is on\n/manuadd: Move a player to desired group.(Adds to the file if no\n/manuaddp: Add permissions diretly to the player.\n/manuaddsub: Add a group to a player's subgroup list.\n/manuaddv: Add, or replaces, a variable to a user (like prefix o\n/manucheckp: Verify if user has a permissions, and where it come\n/manucheckv: Verify a value of a variable of user, and where it\n/manudel: Remove any user specific configuration. Make him defau\n/manudelp: Removes permissions diretly from the player.\n/manudelsub: Remove a group to a player's subgroup list.\n/manudelv: Remove a variable from a user.\n/manulistp: List all permissionss from a player.\n/manulistv: List variables a user has (like prefix or suffix).\n/manwhois: Tell the group that user belongs.\n/manworld: Prints the selected world name\n/mask: [mask] - Set the brush mask\n/mat: [pattern] - Set the brush material\n/me: 在接下来说的话中添加星号前缀.\n/mobbounty: Allows user to see MobBountyReloaded information.\n/mobbountycheck: Allows user to check the values for creatures.\n/mobbountydropscheck: Reloads the MobBountyReloadedDrops configs\n/mobbountydropsdrops: Allows the user to modify drop strings for\n/mobbountydropsload: Reloads the MobBountyReloadedDrops configs./mobbountydropssave: Reloads the MobBountyReloadedDrops configs./mobbountydropsworlddrops: Allows the user to modify drop string.\n/mobbountyenvmulti: Allows user to change an environment multipl\n/mobbountyexploitsload: Reloads the plugin's configs.\n/mobbountyexploitsmodify: Modifies the plugin's configs.\n/mobbountyexploitssave: Saves the plugin's configs.\n/mobbountygeneral: Allows user to change values of creatures.\n/mobbountygroupmulti: Allows user to change a group multiplier.\n/mobbountyload: Allows user to reload the MBR configs.\n/mobbountyreward: Allows user to change values of creatures.\n/mobbountysave: Allows user to reload the MBR configs.\n/mobbountytimemulti: Allows user to change a time multiplier.\n/mobbountyusermulti: Allows user to change a user multiplier.\n/mobbountyworldreward: Allows user to change values of creatures\n/mobhealth: Root command for all  MobHealth Commands.\n/money: Distrobute, Check, Use Currency.\n/more: 让手中物品达到最大堆叠.\n/motd: 查看今日服务器消息.\n/msg: 发送一条密语给某玩家.\n/mute: 禁言或解禁 玩家.\n/mv: Generic Multiverse Command\n/mvc: Display World, Coordinates, Direction & Compression for a\n/mvclone: World clone command\n/mvco: Displays the player's coordinates.\n/mvconfirm: Confirms sensitive decisions like deleting a world.\n/mvcoord: Display World, Coordinates, Direction & Compression fo\n/mvcreate: World create command\n/mvdebug: Turns on debugging.\n/mvdelete: World delete command\n/mvenv: Tells the user all possible environment types.\n/mvgenerators: Displays all found world generators.\n/mvgens: Displays all found world generators.\n/mvh: Displays the Multiverse Help.\n/mvhelp: Displays the Multiverse Help.\n/mvi: Gets world info.\n/mvim: World import command\n/mvimport: World import command\n/mvinfo: Gets world info.\n/mvl: Print list of loaded Worlds\n/mvlist: Print list of loaded Worlds\n/mvload: Loads a world into Multiverse.\n/mvm: Modify the settings of an existing world\n/mvmadd: Modify the settings of an existing world\n/mvmclear: Modify the settings of an existing world\n/mvmodify: Modify the settings of an existing world\n/mvmremove: Modify the settings of an existing world\n/mvmset: Modify the settings of an existing world\n/mvpurge: Purge the targetted world of creatures.\n/mvr: Reload Configuration files.\n/mvregen: Regenerates a world Multiverse already knows about.\n/mvreload: Reload Configuration files.\n/mvremove: World remove command\n/mvs: Teleport to the spawn area\n/mvscript: Runs a script from the Multiverse scripts directory.\n/mvsearch: Displays the Multiverse Help.\n/mvset: Set the spawn area for a particular world\n/mvsetspawn: Set the spawn area for a particular world\n/mvsilent: Reduces startup messages\n/mvspawn: Teleport to the spawn area\n/mvss: Set the spawn area for a particular world\n/mvtp: Command to teleport between Worlds\n/mvunload: World unload command\n/mvv: Prints out version info.\n/mvversion: Prints out version info.\n/mvw: Display online users per world.\n/mvwho: Display online users per world.\n/mypet: Help for all MyPet commands.\n/near: 列出自己身边的玩家,或列出某玩家附近的其它玩家.\n/nick: 改变自己的昵称,或者别人的昵称<管理员>.\n/none: Unbind a bound tool from your current item\n/nuke: 发射核武器.\n/op: Gives the specified player operator status\n/packet: Add or remove a simple packet listener.\n/pardon-ip: Allows the specified IP address to use this server\n/pay: 从你的账户中转账付费给某玩家.\n/petadmin: Set the Exp or Name of a MyPet\n/petbeacon: Beacon!\n/petbehavior: Switch the behavior mode of your MyPet.\n/petcall: Call your MyPet.\n/petchooseskilltree: Chooses a skilltree.\n/petinfo: Shows HP and Exp of your MyPet\n/petinventory: Open the inventory of your MyPet.\n/petname: Set the name of your MyPet\n/petpickup: Toogles pickup of your MyPet.\n/petrelease: Release your MyPet.\n/petsendaway: Send your MyPet away.\n/petskill: Shows the skill-levels of a online MyPet\n/petskilltree: Shows a fully configured skilltree\n/petstop: your MyPet stop attacking.\n/ping: 啪啪啪啪啪啪啪啪啪!\n/pistonjump: To see the PistonJump help.\n/plugin: Load, unload or reload the specified plugins.\n/plugins: Gets a list of plugins running on the server\n/powertool: 给手中物品指定一个命令.\n/powertooltoggle: 开启或关闭当前所有的powertool.\n/protocol: Performs administrative tasks regarding ProtocolLib.\n/ptime: 专门调整某玩家客户端的时间. 添加 @ 前缀来修复.\n/pumpkins: [size] - Generate pumpkin patches\n/quit: Manually quit your session.\n/r: 快速回复别人发给你的信息(邮件/私信).\n/range: [pattern] - Set the brush range\n/rc: Chat in current residence channel.\n/realname: 查看某玩家的真名(nick之前的名字).\n/region: Region management commands\n/register: Register your player with the supplied password.\n/reload: Reloads the server configuration and plugins\n/remove: <type> <radius> - Remove all entities of a type\n/repair: 修复<手中|所有>的物品.\n/repl: <block> - Block replacer tool\n/res: Manage Residences\n/resadmin: Residence admin functions.\n/residence: Manage Residences\n/resload: Load the save file again after you have made modificat\n/resreload: Reload the entire residence plugin.\n/restore: [snapshot] - Restore the selection from a snapshot\n/resworld: Removes every residence in a world.\n/rules: 查看服务器规则.\n/save-all: Saves the server to disk\n/save-off: Disables server autosaving\n/save-on: Enables server autosaving\n/say: Broadcasts the given message as the console\n/sbackup: Run the map backup\n/seed: Shows the world seed\n/seen: 查看最后一位玩家登出的时间.\n/sell: 把手中的物品出售给系统.\n/serverstate: Show the server stats using a command\n/sethome: 把你的家设置在这个位置.\n/setjail: 在你所在位置设置一个监狱,名称叫 [监狱名称]\n/setspawn: Set the spawnpoint to your current position.\n/setwarp: 创建一个新的地标.\n/setworth: 设置某个物品的价值.\n/sg: Used to reload the plugin. Console use only.\n/shelfit: Lists ShelfIt's commands and uses.\n/showcasestandalone: Access to all ShowCaseStandalone related co\n/signedit: Allows you to edit a sign\n/size: [pattern] - Set the brush size\n/snapshot: Snapshot commands\n/socialspy: 切换你是否可以看到其他玩家的私聊和邮件.\n/spawn: Teleport to the spawnpoint.\n/spawner: 改变一个刷怪笼的类型.\n/spawnmob: 生成一个生物.\n/spawnpoint: Sets a player's spawn point\n/speed: 改变移动速度.\n/ss: Short-Command for serverstate\n/stop: Stops the server with optional reason\n/stopfire: [<world>] - Disables all fire spread temporarily\n/sudo: 让某玩家强制执行一个命令.\n/suicide: 自杀.\n/superpickaxe: Select super pickaxe mode\n/tempadd: Creates a temporary permissions copy for that user.\n/tempban: 临时封禁一个玩家.\n/tempdel: Remove the temporary permissions copy for player.\n/tempdelall: Remove all overrides made by command /tempadd.\n/templist: List players in overload-permissionss mode made by /t\n/thru: Passthrough walls\n/thunder: 允许/禁止 自然雷击.\n/time: 显示/改变世界的时间,默认当前世界.\n/timeismoney: Give connection time and earned money\n/timeismoney:reload: Give connection time and earned money\n/timings: Records timings for all plugin events\n/togglechop: Toggle ChopTree\n/toggledownfall: Toggles rain on/off on a given world\n/toggleeditwand: Toggle functionality of the edit wand\n/togglejail: 监禁/解禁一个玩家,并传送他到监狱.\n/tool: Select a tool to bind\n/top: 传送到你所站坐标上的最高方块处.\n/tp: 强行传送到某玩家.\n/tpa: 发送一条传送请求,让你传送到对象玩家的地点.\n/tpaall: 发送一条传送请求,让所有玩家都传送到你这里.\n/tpaccept: 接受传送请求.\n/tpahere: 发送一条传送请求,让对象玩家传送到你所在的地点.\n/tpall: 强制把所有在线玩家传送到自己的位置.\n/tpdeny: 拒绝传送请求.\n/tphere: 强制把一个玩家传送到自己的位置.\n/tpo: 强行传送到某玩家,无视拒绝传送.\n/tpohere: 强制把一个玩家传送到自己的位置,无视拒绝传送.\n/tppos: 把自己传送到某个坐标.\n/tptoggle: 拒绝所有传送.\n/tree: [type] - Tree generator tool\n/unban: 解除封禁玩家.\n/unbanip: 解除封禁IP地址.\n/undisguise: Remove a disguise.\n/unlimited: 允许某玩家无限放置某方块.\n/unstuck: Escape from being stuck inside a block\n/up: <block> - Go upwards some distance\n/vanish: 进入隐身模式,其他玩家将无法看到你.\n/vault-convert: Converts all data in economy1 and dumps it into\n/vault-info: Displays information about Vault\n/version: Gets the version of this server including any plugins\n/warp: 列出所有的地标,或传送到该地标.\n/we: WorldEdit commands\n/weather: 设置所在世界的天气.\n/whitelist: Prevents the specified player from using this server/whois: 在昵称后面显示真名,并列出玩家信息.\n/workbench: 随时随地开启一个工作台\n/world: 在各个世界间转换.\n/worldguard: WorldGuard commands\n/worth: 查看某物品的价值.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
